import java.io.*;
import java.util.Objects;

public class Visualizer {
    private BufferedWriter writer;

    public Visualizer(String outputPath) {
        try {
            this.writer = new BufferedWriter(new FileWriter(outputPath));
            writer.write("digraph G {\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeWriter() {
        try {
            writer.write("}");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void traverseAndWrite(Tree root) {
        traverse(root, 0);
    }

    private void traverse(Tree node, int depth) {
        if (node != null) {
            String nodeName = node.node.replace("\"", "");
            writeNode(nodeName, depth);
            for (Tree child : node.children) {
                traverse(child, depth + 1);
                writeEdge(nodeName, child.node.replace("\"", ""), depth);
            }
        }
    }

    private void writeNode(String nodeName, int depth) {
        try {

            writer.write(String.format("  \"%s_%s\" [label=\"%s\"]\n", depth, nodeName, nodeName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeEdge(String source, String destination, int depth) {
        try {
            source = source.replaceAll(":\\s*([(){};,]+)", ":\"$1\"");
            writer.write(String.format("  \"%s_%s\" -> \"%s_%s\"\n", depth, source,depth + 1, destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String concatLeaf(Tree root) {
        StringBuilder result = new StringBuilder();
        findLeaf(root, result);
        return result.toString();
    }

    private void findLeaf(Tree node, StringBuilder result) {
        if (node != null) {
            if (node.children.isEmpty()) {
                String thirdWord = wordByIndx(node.node);
                switch (thirdWord) {
                    case "int", "double", "float", "char", "unsigned", "void", "," -> result.append(thirdWord).append(" ");
                    default -> result.append(thirdWord);
                }
            } else {
                for (Tree child : node.children) {
                    findLeaf(child, result);
                }
            }
        }
    }

    private static String wordByIndx(String text) {
        String[] words = text.trim().split("\\s+");
        return !Objects.equals(words[0], "EPS") ? words[1] : "";
    }
}

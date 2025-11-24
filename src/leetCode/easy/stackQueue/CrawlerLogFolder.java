package leetCode.easy.stackQueue;

/// 1598. Crawler Log Folder
public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int depth = 0;
        for(String log : logs){
            if (log.equals("../")){
                if (depth>0)
                    depth--;
            } else if (!log.equals("./")) {
                depth++;
            }
        }
        return depth;
    }
}

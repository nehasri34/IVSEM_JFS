public class sinknode {
    public static void main(String[] args) {
        int graph[][]={ {0,1,1,0,1},{0,0,0,1,0},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,0}};
        int zero_ctr=0;
        int sink_ctr=0;
        for(int i=0;i<graph.length;i++){
            zero_ctr=0;
            for(int j=0;j<graph[0].length;j++) {
                if (graph[i][j] == 0) {
                    zero_ctr++;
                }
            }
                if(zero_ctr==graph.length){
                    System.out.println("Sink node="+(char)(65+i));
                    sink_ctr++;
                }
            }
            System.out.println("No.of sink nodes="+sink_ctr);
        }
    }

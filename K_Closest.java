//Given a array of points and a source point S(x,y), get the K closest points to S.

import java.io.*;
import java.util.*;

class K_Closest
{
    public static class point
    {
        int x;
        int y;
    }

    public static point Source;

    public static class pointComparator implements Comparator<point>
    {
        public int compare(point p1,point p2)
        {
            int d1 = distance(p1,Source);
            int d2 = distance(p2,Source);
            return d1-d2;
        }
    }

    public static int distance(point p1,point p2)
    {
        int distance = (int)Math.round(Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y)));
        return distance;
    }

    public static void main(String[] args)
    {
        Source = new point();
        Source.x = 2;
        Source.y = 3;

        int k = 2;

        pointComparator pq = new pointComparator();
        PriorityQueue<point> Q = new PriorityQueue<>(pq);

        point p1 = new point();
        p1.x = 1;
        p1.y = 1;
        Q.offer(p1);

        point p2 = new point();
        p2.x = 0;
        p2.y = 0;
        Q.offer(p2);

        point p3 = new point();
        p3.x = 5;
        p3.y = 7;
        Q.offer(p3);

        point p4 = new point();
        p4.x = 2;
        p4.y = 2;
        Q.offer(p4);

        point p5 = new point();
        p5.x = 9;
        p5.y = 9;
        Q.offer(p5);

        point p6 = new point();
        p6.x = 1;
        p6.y = 9;
        Q.offer(p6);

        point p7 = new point();
        p7.x = 0;
        p7.y = 4;
        Q.offer(p7);

        System.out.println("size: "+Q.size());

        Iterator<point> it = Q.iterator();
        while(it.hasNext())
        {
            point temp = it.next();
            System.out.print("("+temp.x+","+temp.y+")");
        }
        System.out.println();


        System.out.println(k+" closest points to source : ("+Source.x+","+Source.y+")");
        for(int i=0;i<7;i++)
        {
            point temp = Q.poll();
            System.out.println("("+temp.x+","+temp.y+")");
        }

    }
}

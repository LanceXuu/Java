package 校招.阿里巴巴.ali9_7two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Lance
 * @Date: 2018/9/7 20:24
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String temp = bufferedReader.readLine();
        String[] flag = temp.split(",");

        int[] self = new int[flag.length];

        for (int i = 0; i < flag.length; i++)
        {
            self[i] = Integer.parseInt(flag[i]);
        }


        String temp1 = bufferedReader.readLine();
        String[] fanwei = temp1.split(",");

        int[] mubiao = new int[fanwei.length];

        for (int i = 0; i < fanwei.length; i++)
        {
            mubiao[i] = Integer.parseInt(fanwei[i]);
        }

        for (int i = 0; i < mubiao.length; i += 2)
        {
            double x = mubiao[i];
            double y = mubiao[i + 1];
            Point2D point2D = new Point2D(x, y);

        }


    }

//    public static boolean isPtInMyPoly(Point2D point, List<Point2D> pts)
//    {
//
//        int N = pts.size();
//        boolean boundOrVertex = true; //如果点位于多边形的顶点或边上，也算做点在多边形内，直接返回true
//        int intersectCount = 0;//cross points count of x
//        double precision = 2e-10; //浮点类型计算时候与0比较时候的容差
//        Point2D p1, p2;//neighbour bound vertices
//        Point2D p = point; //当前点
//
//        p1 = pts.get(0);//left vertex
//        for (int i = 1; i <= N; ++i)
//        {//check all rays
//            if (p.equals(p1))
//            {
//                return boundOrVertex;//p is an vertex
//            }
//
//            p2 = pts.get(i % N);//right vertex
//            if (p.x < Math.min(p1.x, p2.x) || p.x > Math.max(p1.x, p2.x))
//            {//ray is outside of our interests
//                p1 = p2;
//                continue;//next ray left point
//            }
//
//            if (p.x > Math.min(p1.x, p2.x) && p.x < Math.max(p1.x, p2.x))
//            {//ray is crossing over by the algorithm (common part of)
//                if (p.y <= Math.max(p1.y, p2.y))
//                {//x is before of ray
//                    if (p1.x == p2.x && p.y >= Math.min(p1.y, p2.y))
//                    {//overlies on a horizontal ray
//                        return boundOrVertex;
//                    }
//
//                    if (p1.y == p2.y)
//                    {//ray is vertical
//                        if (p1.y == p.y)
//                        {//overlies on a vertical ray
//                            return boundOrVertex;
//                        } else
//                        {//before ray
//                            ++intersectCount;
//                        }
//                    } else
//                    {//cross point on the left side
//                        double xinters = (p.x - p1.x) * (p2.y - p1.y) / (p2.x - p1.x) + p1.y;//cross point of y
//                        if (Math.abs(p.y - xinters) < precision)
//                        {//overlies on a ray
//                            return boundOrVertex;
//                        }
//
//                        if (p.y < xinters)
//                        {//before ray
//                            ++intersectCount;
//                        }
//                    }
//                }
//            } else
//            {//special case when ray is crossing through the vertex
//                if (p.x == p2.x && p.y <= p2.y)
//                {//p crossing over p2
//                    Point2D p3 = pts.get((i + 1) % N); //next vertex
//                    if (p.x >= Math.min(p1.x, p3.x) && p.x <= Math.max(p1.x, p3.x))
//                    {//p.x lies between p1.x & p3.x
//                        ++intersectCount;
//                    } else
//                    {
//                        intersectCount += 2;
//                    }
//                }
//            }
//            p1 = p2;//next ray left point
//        }
//
//        if (intersectCount % 2 == 0)
//        {//偶数在多边形外
//            return false;
//        } else
//        { //奇数在多边形内
//            return true;
//        }
//
//    }
}


class Point2D
{

    public double x;
    public double y;

    public Point2D(double x, double y)
    {
        super();
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }
}




public class Test {
	main() {
	    int i=0;
	    String c = "(5((((`+((((f(H+(P7(d(([)(/(`G(X)7d+(.X+d)X+d(_(d.GXA`gg/d(dggI7(dgg`+(dg7^)(dgKE((dGD/((d/K)(((((((((0X)(((7F(<(XK/H7(d`)`)(.D(F(H(G(/(D`7X(HOg+6(`YgX;(fd7d7//d+7X[+GHKgdX7gg77fcggYKgfg/";
	    while(i++ < 1122) {
	        if(i%34) {
	            if (c[i/6]-40&1<<i%6) {
	                printf("XX");
	            } else {
	                printf("  ");
	            }
	        } else {
	            printf("\n");
	        }
	    }
	}

}

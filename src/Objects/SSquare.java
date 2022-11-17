package Objects;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SSquare extends SObject{
    private float length;

    public SSquare(){
        super();
        init();
        update();
    }

    public SSquare(float length){
        super();
        init();
        this.length = length;
        update();
    }

    private void init(){
        this.length = 1;
    }

    @Override
    protected void genData() {

        this.vertices = new float[] { //define vertex coordinates
                0, 0, 0,
                length, 0, 0,
                0, length, 0,
                length, length, 0
        };

        this.normals = new float[] {
                -1, -1, -1,
                1, -1, -1,
                -1, 1, -1,
                1, 1, -1,
        };

        this.textures = new float[] { //define texture coordinates
                0, 0,
                1, 0,
                0, 1,
                1, 1
        };

        this.indices = new int[] {
                0, 1, 2,
                2, 1, 3
        };

        this.numIndices = indices.length;
        this.numVertices = vertices.length;
    }

    public void setLength(float length){
        this.length = length;
        updated = false;
    }

    public float getLength(){
        return length;
    }
}
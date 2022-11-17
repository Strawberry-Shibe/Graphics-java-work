package Objects;

public class SCube extends SObject{
    private float length;

    public SCube(){
        super();
        init();
        update();
    }

    public SCube(float length){
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
                //bottom
                0, 0, 0,
                0, 0, length,
                length, 0, length,
                length, 0, 0,

                //top
                0, length, 0,
                length, length, 0,
                length, length, length,
                0, length, length,

                //front
                0, 0, length,
                0, length, length,
                length, length, length,
                length, 0, length,

                //back
                0, 0, 0,
                0, length, 0,
                length, length, 0,
                length, 0, 0,

                //left
                0, 0, 0,
                0, length, 0,
                0, length, length,
                0, 0, length,

                //right
                length, 0, 0,
                length, length, 0,
                length, length, length,
                length, 0, length,
        };

        this.normals = new float[] { //define vertex normals
                //bottom
                0, -1, 0,
                0, -1, 0,
                0, -1, 0,
                0, -1, 0,

                //top
                0, 1, 0,
                0, 1, 0,
                0, 1, 0,
                0, 1, 0,

                //front
                0, 0, 1,
                0, 0, 1,
                0, 0, 1,
                0, 0, 1,

                //back
                0, 0, -1,
                0, 0, -1,
                0, 0, -1,
                0, 0, -1,

                //left
                -1, 0, 0,
                -1, 0, 0,
                -1, 0, 0,
                -1, 0, 0,

                //right
                1, 0, 0,
                1, 0, 0,
                1, 0, 0,
                1, 0, 0,

        };

        this.textures = new float[] { //define texture coords
                //bottom
                0, 0,
                0, 1,
                1, 1,
                1, 0,

                //top
                0, 0,
                1, 0,
                1, 1,
                0, 1,

                //front
                0, 1,
                0, 0,
                1, 0,
                1, 1,

                //back
                0, 1,
                0, 0,
                1, 1,
                1, 1,

                //left
                0, 0,
                1, 0,
                1, 1,
                0, 1,

                //right
                0, 0,
                1, 0,
                1, 1,
                0, 1,
        };

        this.indices = new int[]{
                // Generate indices for triangular mesh

                //bottom
                0,1,2,
                2,3,0,

                //top
                4,5,6,
                6,7,4,

                //front
                8,9,10,
                10,11,8,

                //back
                13,12,14,
                15,14,12,

                //left
                16,17,18,
                18,19,16,

                //right
                16,17,18,
                18,19,16,

                21,20,22,
                23,22,20,
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
class Room {
    private float length;
    private float breadth;
    private float height;

    public Room(float length, float breadth, float height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public float volume() {
        return length * breadth * height;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + volume());
    }
}

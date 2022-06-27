package ss16_io_test_file.bai_tap;

public class Nations {
    private int no;
    private String code;
    private String nationsName;

    public Nations() {
    }

    public Nations(int no, String code, String nationsName) {
        this.no = no;
        this.code = code;
        this.nationsName = nationsName;
    }

    @Override
    public String toString() {
        return "Nations{" +
                "no=" + no +
                ", code='" + code + '\'' +
                ", nationsName='" + nationsName + '\'' +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNationsName() {
        return nationsName;
    }

    public void setNationsName(String nationsName) {
        this.nationsName = nationsName;
    }
}

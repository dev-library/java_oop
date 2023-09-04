package chap04_01adapter;

// 휴대폰에서 어떤 영상매체물을 실행할 때, 확장자 구분 없이 다 실행 잘 됨
public class FormatAdapter implements MediaPlayer {

    private MediaPackage media;

    public FormatAdapter(MediaPackage media){
        this.media = media;
    }

    @Override
    public void play(String fileName) {
        System.out.print("어댑터를 사용한 케이스! : ");
        media.playFile(fileName);
    }
}

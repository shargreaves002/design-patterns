package behavioral.memento;

public class Editor {
    private String content = "";

    public void type(String words){
        content += " " + words;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save(){
        return new EditorMemento(this.content);
    }

    public void restore(EditorMemento memento){
        this.content = memento.getContent();
    }
}

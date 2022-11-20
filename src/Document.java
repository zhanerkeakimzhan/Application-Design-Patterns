public abstract class Document {
    IProtocol protocol = createProtocol();
    public abstract IProtocol createProtocol();
}

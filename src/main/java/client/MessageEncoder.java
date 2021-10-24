package client;

public class MessageEncoder extends MessageToMessageEncoder<String> {

    @Override
    protected void encode(ChannelHandlerContext ctx, String msg, List<Object> out) throws Exception {
        out.add(msg.getBytes(StandardCharsets.UTF_8));
    }
}

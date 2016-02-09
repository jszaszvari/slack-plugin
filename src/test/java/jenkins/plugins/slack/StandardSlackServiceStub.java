package jenkins.plugins.slack;

public class StandardSlackServiceStub extends StandardSlackService {

    private ClientStub clientStub;

    public StandardSlackServiceStub(String teamDomain, String token, String tokenCredentialId, String roomId, String apiToken) {
        super(teamDomain, token, tokenCredentialId, roomId, apiToken);
    }

    @Override
    protected ClientStub getClient() {
        return this.clientStub;
    }

    public void setClientStub(ClientStub client) {
        this.clientStub = client;
    }
}

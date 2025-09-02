package src.advanced.executiveFramework.composingCompletable;

import java.util.concurrent.CompletableFuture;

public class EmailToPlaylist {
    public static CompletableFuture<String> getEmail(){
        return CompletableFuture.supplyAsync(()-> "email");
    }

    public static CompletableFuture<String> getPlaylistAsync(String email){
        return CompletableFuture.supplyAsync(()-> "Playlist");
    }

    public static void show(){
        getEmail()
                .thenCompose(EmailToPlaylist :: getPlaylistAsync)
                .thenAccept(playlist -> System.out.println(playlist));
    }

    public static void main(String[] args) {
        EmailToPlaylist.show();
    }
}

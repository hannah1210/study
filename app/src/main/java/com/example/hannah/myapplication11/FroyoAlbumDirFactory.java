package com.example.hannah.myapplication11;

import android.os.Environment;

import java.io.File;

/**
 * Created by Hannah on 2017-07-03.
 */

public final class FroyoAlbumDirFactory extends AlbumStorageDirFactory {
    @Override
    public File getAlbumStorageDir(String albumName) {
        // TODO Auto-generated method stub
        return new File(
                Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_PICTURES
                ),
                albumName
        );
    }
}

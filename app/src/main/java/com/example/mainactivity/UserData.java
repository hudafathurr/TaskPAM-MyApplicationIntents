package com.example.mainactivity;

import android.os.Parcel;
import android.os.Parcelable;

public class UserData implements Parcelable {
    private final String name;
    private final String email;
    private final String status;


    public UserData(String name, String email, String status) {
        this.name = name;
        this.email = email;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.status);
    }

    protected UserData(Parcel in) {
        this.name = in.readString();
        this.email = in.readString();
        this.status = in.readString();
    }

    public static final Creator<UserData> CREATOR = new Creator<UserData>() {
        @Override
        public UserData createFromParcel(Parcel source) {
            return new UserData(source);
        }

        @Override
        public UserData[] newArray(int size) {
            return new UserData[size];
        }
    };

}

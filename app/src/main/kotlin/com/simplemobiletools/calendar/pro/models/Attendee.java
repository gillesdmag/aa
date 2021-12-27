package com.simplemobiletools.calendar.pro.models;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {1, 5, 1},
    k = 1,
    d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010(\u001a\u00020\u0005J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0006\u0010*\u001a\u00020\nJ\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u001e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u001b¨\u00064"},
    d2 = {"Lcom/simplemobiletools/calendar/pro/models/Attendee;", "", "contactId", "", "name", "", "email", "status", "photoUri", "isMe", "", "relationship", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZI)V", "getContactId", "()I", "getEmail", "()Ljava/lang/String;", "()Z", "setMe", "(Z)V", "getName", "setName", "(Ljava/lang/String;)V", "getPhotoUri", "setPhotoUri", "getRelationship", "setRelationship", "(I)V", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "getPublicName", "hashCode", "showStatusImage", "toString", "updateImage", "", "context", "Landroid/content/Context;", "imageView", "Landroid/widget/ImageView;", "placeholder", "Landroid/graphics/drawable/Drawable;", "calendar_debug"}
)
public final class Attendee {
    private final int contactId;
    @NotNull
    private String name;
    @NotNull
    private final String email;
    private int status;
    @NotNull
    private String photoUri;
    private boolean isMe;
    private int relationship;

    @NotNull
    public final String getPublicName() {
        CharSequence var1 = (CharSequence)this.name;
        return var1.length() > 0 ? this.name : this.email;
    }

    public final void updateImage(@NotNull Context context, @NotNull ImageView imageView, @NotNull Drawable placeholder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        CharSequence var4 = (CharSequence)this.photoUri;
        if (var4.length() == 0) {
            imageView.setImageDrawable(placeholder);
        } else {
            BaseRequestOptions var10000 = ((RequestOptions)((RequestOptions)(new RequestOptions()).diskCacheStrategy(DiskCacheStrategy.RESOURCE)).error(placeholder)).centerCrop();
            Intrinsics.checkNotNullExpressionValue(var10000, "RequestOptions()\n       …            .centerCrop()");
            RequestOptions options = (RequestOptions)var10000;
            Intrinsics.checkNotNullExpressionValue(((RequestBuilder)Glide.with(context).load(this.photoUri).transition((TransitionOptions)DrawableTransitionOptions.withCrossFade()).placeholder(placeholder)).apply((BaseRequestOptions)options).apply((BaseRequestOptions)RequestOptions.circleCropTransform()).into(imageView), "Glide.with(context)\n    …         .into(imageView)");
        }

    }

    public final boolean showStatusImage() {
        return this.status == 1 || this.status == 2 || this.status == 4;
    }

    public final int getContactId() {
        return this.contactId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.name = var1;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int var1) {
        this.status = var1;
    }

    @NotNull
    public final String getPhotoUri() {
        return this.photoUri;
    }

    public final void setPhotoUri(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.photoUri = var1;
    }

    public final boolean isMe() {
        return this.isMe;
    }

    public final void setMe(boolean var1) {
        this.isMe = var1;
    }

    public final int getRelationship() {
        return this.relationship;
    }

    public final void setRelationship(int var1) {
        this.relationship = var1;
    }

    public Attendee(int contactId, @NotNull String name, @NotNull String email, int status, @NotNull String photoUri, boolean isMe, int relationship) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(photoUri, "photoUri");
        super();
        this.contactId = contactId;
        this.name = name;
        this.email = email;
        this.status = status;
        this.photoUri = photoUri;
        this.isMe = isMe;
        this.relationship = relationship;
    }

    public final int component1() {
        return this.contactId;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.email;
    }

    public final int component4() {
        return this.status;
    }

    @NotNull
    public final String component5() {
        return this.photoUri;
    }

    public final boolean component6() {
        return this.isMe;
    }

    public final int component7() {
        return this.relationship;
    }

    @NotNull
    public final Attendee copy(int contactId, @NotNull String name, @NotNull String email, int status, @NotNull String photoUri, boolean isMe, int relationship) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(photoUri, "photoUri");
        return new Attendee(contactId, name, email, status, photoUri, isMe, relationship);
    }

    // $FF: synthetic method
    public static Attendee copy$default(Attendee var0, int var1, String var2, String var3, int var4, String var5, boolean var6, int var7, int var8, Object var9) {
        if ((var8 & 1) != 0) {
            var1 = var0.contactId;
        }

        if ((var8 & 2) != 0) {
            var2 = var0.name;
        }

        if ((var8 & 4) != 0) {
            var3 = var0.email;
        }

        if ((var8 & 8) != 0) {
            var4 = var0.status;
        }

        if ((var8 & 16) != 0) {
            var5 = var0.photoUri;
        }

        if ((var8 & 32) != 0) {
            var6 = var0.isMe;
        }

        if ((var8 & 64) != 0) {
            var7 = var0.relationship;
        }

        return var0.copy(var1, var2, var3, var4, var5, var6, var7);
    }

    @NotNull
    public String toString() {
        return "Attendee(contactId=" + this.contactId + ", name=" + this.name + ", email=" + this.email + ", status=" + this.status + ", photoUri=" + this.photoUri + ", isMe=" + this.isMe + ", relationship=" + this.relationship + ")";
    }

    public int hashCode() {
        int var10000 = Integer.hashCode(this.contactId) * 31;
        String var10001 = this.name;
        var10000 = (var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.email;
        var10000 = ((var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31 + Integer.hashCode(this.status)) * 31;
        var10001 = this.photoUri;
        var10000 = (var10000 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        byte var1 = this.isMe;
        if (var1 != 0) {
            var1 = 1;
        }

        return (var10000 + var1) * 31 + Integer.hashCode(this.relationship);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Attendee) {
                Attendee var2 = (Attendee)var1;
                if (this.contactId == var2.contactId && Intrinsics.areEqual(this.name, var2.name) && Intrinsics.areEqual(this.email, var2.email) && this.status == var2.status && Intrinsics.areEqual(this.photoUri, var2.photoUri) && this.isMe == var2.isMe && this.relationship == var2.relationship) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}

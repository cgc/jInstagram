/**
 * Copyright (C) 2011 by Sachin Handiekar
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jinstagram.entity.comments;

import com.google.gson.annotations.SerializedName;

import org.jinstagram.entity.common.Meta;

import java.util.List;

public class MediaCommentsFeed {
    @SerializedName("data")
    private List<CommentData> commentDataList;

    @SerializedName("meta")
    private Meta meta;

    /**
     * @return the meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * @param meta the meta to set
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * @return the commentDataList
     */
    public List<CommentData> getCommentDataList() {
        return commentDataList;
    }

    /**
     * @param commentDataList the commentDataList to set
     */
    public void setCommentDataList(List<CommentData> commentDataList) {
        this.commentDataList = commentDataList;
    }

    @Override
    public String toString() {
        return String.format("MediaCommentsFeed [commentDataList=%s, meta=%s]", commentDataList, meta);
    }
}

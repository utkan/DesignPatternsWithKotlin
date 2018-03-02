package behavioral.com.iluwatar.chain

import java.util.Objects

class Request
/**
 * Create a new request of the given type and accompanied description.
 *
 * @param requestType        The type of request
 * @param requestDescription The description of the request
 */
(requestType: RequestType, requestDescription: String) {

    /**
     * The type of this request, used by each item in the chain to see if they should or can handle
     * this particular request
     */
    /**
     * Get the type of this request, used by each person in the chain of command to see if they should
     * or can handle this particular request
     *
     * @return The request type
     */
    val requestType: RequestType = Objects.requireNonNull(requestType)

    /**
     * A description of the request
     */
    /**
     * Get a description of the request
     *
     * @return A human readable description of the request
     */
    val requestDescription: String = Objects.requireNonNull(requestDescription)

    /**
     * Indicates if the request is handled or not. A request can only switch state from unhandled to
     * handled, there's no way to 'unhandle' a request
     */
    /**
     * Indicates if this request is handled or not
     *
     * @return <tt>true</tt> when the request is handled, <tt>false</tt> if not
     */
    var isHandled: Boolean = false
        private set

    fun markHandled() {
        this.isHandled = true
    }

    override fun toString(): String {
        return requestDescription
    }
}
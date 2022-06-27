public interface Position<I> {
    /**
     * Returns the element stored at this position.
     *
     * @return the stored element
     * @throws IllegalStateException if position no longer valid
     */
    I getElement() throws IllegalStateException;
}
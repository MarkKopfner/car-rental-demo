package com.example.carrentaldemo.domain.ddd.domain.base;

/**
 * Abstract class for events inside a domain.
 * @param <E> type of aggregate root encapsulated in this event
 */
public abstract class AbstractDomainEvent<E extends AggregateRoot> {

    private final E root;

    private final String type;

    private Boolean sent;

    protected AbstractDomainEvent(E root) {
        this.root = root;
        this.type = this.getClass().getSimpleName();
        this.sent = Boolean.FALSE;
    }

    /**
     * Return the Aggregate Root
     *
     * @return aggregate root of type E
     */
    public E getRoot() {
        return this.root;
    }

    /**
     * Return event type
     *
     * @return event type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Return sent which marks this event as sent into Domain Event Storage.
     *
     * @return sent
     */
    public Boolean getSent() {
        return this.sent;
    }

    /**
     * Mark this event as sent.
     *
     * @apiNote this is required to change the state. One can avoide using the immutability approach
     * in order to avoid setters.
     */
    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}

package axa.jpa.h2.axa_h2_jpa.entitiess;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChildAddresses is a Querydsl query type for ChildAddresses
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChildAddresses extends EntityPathBase<ChildAddresses> {

    private static final long serialVersionUID = -402522328L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChildAddresses childAddresses = new QChildAddresses("childAddresses");

    public final StringPath Address1 = createString("Address1");

    public final StringPath Address2 = createString("Address2");

    public final NumberPath<Integer> ChildAddressId = createNumber("ChildAddressId", Integer.class);

    public final QChildernEnty childernEntity;

    public final SetPath<ChildLastFour, QChildLastFour> childFourList = this.<ChildLastFour, QChildLastFour>createSet("childFourList", ChildLastFour.class, QChildLastFour.class, PathInits.DIRECT2);

    public QChildAddresses(String variable) {
        this(ChildAddresses.class, forVariable(variable), INITS);
    }

    public QChildAddresses(Path<? extends ChildAddresses> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChildAddresses(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChildAddresses(PathMetadata metadata, PathInits inits) {
        this(ChildAddresses.class, metadata, inits);
    }

    public QChildAddresses(Class<? extends ChildAddresses> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.childernEntity = inits.isInitialized("childernEntity") ? new QChildernEnty(forProperty("childernEntity"), inits.get("childernEntity")) : null;
    }

}


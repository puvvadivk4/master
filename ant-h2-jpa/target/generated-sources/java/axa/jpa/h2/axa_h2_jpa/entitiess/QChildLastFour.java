package axa.jpa.h2.axa_h2_jpa.entitiess;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChildLastFour is a Querydsl query type for ChildLastFour
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChildLastFour extends EntityPathBase<ChildLastFour> {

    private static final long serialVersionUID = 1824115862L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChildLastFour childLastFour = new QChildLastFour("childLastFour");

    public final QChildAddresses childernAddressEntity;

    public final NumberPath<Integer> childFourId = createNumber("childFourId", Integer.class);

    public final StringPath childFourName = createString("childFourName");

    public QChildLastFour(String variable) {
        this(ChildLastFour.class, forVariable(variable), INITS);
    }

    public QChildLastFour(Path<? extends ChildLastFour> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChildLastFour(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChildLastFour(PathMetadata metadata, PathInits inits) {
        this(ChildLastFour.class, metadata, inits);
    }

    public QChildLastFour(Class<? extends ChildLastFour> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.childernAddressEntity = inits.isInitialized("childernAddressEntity") ? new QChildAddresses(forProperty("childernAddressEntity"), inits.get("childernAddressEntity")) : null;
    }

}


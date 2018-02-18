package com.protectsoft.apiee.base.interfaces;

import com.protectsoft.apiee.base.entities.BaseEntity;
import java.util.List;

/**
 *
 * @param <M>
 * @param <D>
 */
public interface IMasterDetail<M extends BaseEntity,D extends BaseEntity> {
    
    void setChild(M m,D d);
    
    D getChild(M m);
    
    List<D> getChilds(M m);
}

package gallery;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ImagesView implements Serializable {
     
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private List<String> images;
     
    @PostConstruct
    public void init() {
        FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        
        images = new ArrayList<String>();
        for (int i = 1; i <= 4; i++) {
            images.add("test" + i + ".jpg");
        }
    }

    public List<String> getImages() {
        return images;
    }
}

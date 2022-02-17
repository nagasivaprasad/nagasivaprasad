<?xml version="1.0" encoding="UTF-8"?>
<jcr:root xmlns:sling="http://sling.apache.org/jcr/sling/1.0"
          xmlns:cq="http://www.day.com/jcr/cq/1.0"
          xmlns:jcr="http://www.jcp.org/jcr/1.0"
          xmlns:nt="http://www.jcp.org/jcr/nt/1.0"
          jcr:primaryType="nt:unstructured"
          jcr:title="Byline"
          sling:resourceType="cq/gui/components/authoring/dialog">
        <content jcr:primaryType="nt:unstructured" sling:resourceType="granite/ui/components/coral/foundation/fixedcolumns">
                <items jcr:primaryType="nt:unstructured">
                        <column jcr:primaryType="nt:unstructured" sling:resourceType="granite/ui/components/coral/foundation/container">
                                <items jcr:primaryType="nt:unstructured">
                                        <title jcr:primaryType="nt:unstructured"
                                               sling:resourceType="granite/ui/components/coral/foundation/form/textfield"
                                               emptyText="component title"
                                               fieldDescription="component title"
                                               fieldLabel="Main Title"
                                               name="./title"
                                               required="{Boolean}true" />
                                        <image jcr:primaryType="nt:unstructured" jcr:title="Image" sling:resourceType="granite/ui/components/coral/foundation/container" margin="{Boolean}true">
                                                <items jcr:primaryType="nt:unstructured">
                                                        <columns jcr:primaryType="nt:unstructured" sling:resourceType="granite/ui/components/coral/foundation/fixedcolumns" margin="{Boolean}true">
                                                                <items jcr:primaryType="nt:unstructured">
                                                                        <column jcr:primaryType="nt:unstructured" sling:resourceType="granite/ui/components/coral/foundation/container">
                                                                                <items jcr:primaryType="nt:unstructured">
                                                                                        <file jcr:primaryType="nt:unstructured"
                                                                                              sling:resourceType="cq/gui/components/authoring/dialog/fileupload"
                                                                                              allowUpload="{Boolean}false"
                                                                                              autoStart="{Boolean}false"
                                                                                              class="cq-droptarget"
                                                                                              fieldLabel="Image Asset"
                                                                                              fileNameParameter="./fileName"
                                                                                              fileReferenceParameter="./fileReference"
                                                                                              mimeTypes="[image/gif,image/jpeg,image/png,image/tiff,image/svg+xml]"
                                                                                              multiple="{Boolean}false"
                                                                                              name="./file"
                                                                                              title="Upload Image Asset"
                                                                                              uploadUrl="${suffix.path}"
                                                                                              useHTML5="{Boolean}true" />
                                                                                </items>
                                                                        </column>
                                                                </items>
                                                        </columns>
                                                </items>
                                        </image>
                                        <questions jcr:primaryType="nt:unstructured"
                                                   sling:resourceType="granite/ui/components/coral/foundation/form/multifield"
                                                   composite="{Boolean}true"
                                                   fieldDescription="list of questions"
                                                   fieldLabel="Questions"
                                                   required="{Boolean}false">
                                                <field jcr:primaryType="nt:unstructured" sling:resourceType="granite/ui/components/foundation/form/fieldset" name="./questions">
                                                        <items jcr:primaryType="nt:unstructured">
                                                                <column jcr:primaryType="nt:unstructured" sling:resourceType="granite/ui/components/foundation/container">
                                                                        <items jcr:primaryType="nt:unstructured">
                                                                                <subtitle jcr:primaryType="nt:unstructured"
                                                                                          sling:resourceType="granite/ui/components/coral/foundation/form/textfield"
                                                                                          emptyText="give your question"
                                                                                          fieldDescription="give your question"
                                                                                          fieldLabel="Subtitle"
                                                                                          name="./subtitle"
                                                                                          required="{Boolean}true" />
                                                                                <text jcr:primaryType="nt:unstructured" sling:resourceType="granite/ui/components/coral/foundation/form/textfield" fieldLabel="Description" name="./text" />
                                                                        </items>
                                                                </column>
                                                        </items>
                                                </field>
                                        </questions>
                                </items>
                        </column>
                </items>
        </content>
</jcr:root>

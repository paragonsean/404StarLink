# DocumentLinks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_self** | [**Href**](Href.md) |  | [optional] 
**admins** | [**Dict[str, Href]**](Href.md) |  | [optional] 
**download** | [**Href**](Href.md) |  | [optional] 
**editors** | [**Dict[str, Href]**](Href.md) |  | [optional] 
**preview_box** | [**Href**](Href.md) |  | [optional] 
**preview_pdf** | [**Href**](Href.md) |  | [optional] 
**preview_pdf_viewer** | [**Href**](Href.md) |  | [optional] 
**progress** | [**Href**](Href.md) |  | [optional] 
**project** | [**Href**](Href.md) |  | [optional] 
**strings** | [**Href**](Href.md) |  | [optional] 
**thumbnail** | [**Href**](Href.md) |  | [optional] 

## Example

```python
from openapi_client.models.document_links import DocumentLinks

# TODO update the JSON string below
json = "{}"
# create an instance of DocumentLinks from a JSON string
document_links_instance = DocumentLinks.from_json(json)
# print the JSON string representation of the object
print(DocumentLinks.to_json())

# convert the object into a dict
document_links_dict = document_links_instance.to_dict()
# create an instance of DocumentLinks from a dict
document_links_from_dict = DocumentLinks.from_dict(document_links_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



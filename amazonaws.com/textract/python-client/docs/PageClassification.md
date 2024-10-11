# PageClassification

The class assigned to a Page object detected in an input document. Contains information regarding the predicted type/class of a document's page and the page number that the Page object was detected on.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page_type** | **List** |  | 
**page_number** | **List** |  | 

## Example

```python
from openapi_client.models.page_classification import PageClassification

# TODO update the JSON string below
json = "{}"
# create an instance of PageClassification from a JSON string
page_classification_instance = PageClassification.from_json(json)
# print the JSON string representation of the object
print(PageClassification.to_json())

# convert the object into a dict
page_classification_dict = page_classification_instance.to_dict()
# create an instance of PageClassification from a dict
page_classification_from_dict = PageClassification.from_dict(page_classification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



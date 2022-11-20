# Warning

A warning about an issue that occurred during asynchronous text analysis (<a>StartDocumentAnalysis</a>) or asynchronous document text detection (<a>StartDocumentTextDetection</a>). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_code** | **str** |  | [optional] 
**pages** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.warning import Warning

# TODO update the JSON string below
json = "{}"
# create an instance of Warning from a JSON string
warning_instance = Warning.from_json(json)
# print the JSON string representation of the object
print(Warning.to_json())

# convert the object into a dict
warning_dict = warning_instance.to_dict()
# create an instance of Warning from a dict
warning_from_dict = Warning.from_dict(warning_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



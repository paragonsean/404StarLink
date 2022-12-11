# QaWarnings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report** | [**List[QaEntry]**](QaEntry.md) |  | [optional] 

## Example

```python
from openapi_client.models.qa_warnings import QaWarnings

# TODO update the JSON string below
json = "{}"
# create an instance of QaWarnings from a JSON string
qa_warnings_instance = QaWarnings.from_json(json)
# print the JSON string representation of the object
print(QaWarnings.to_json())

# convert the object into a dict
qa_warnings_dict = qa_warnings_instance.to_dict()
# create an instance of QaWarnings from a dict
qa_warnings_from_dict = QaWarnings.from_dict(qa_warnings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# QaEntry


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **str** |  | [optional] 
**comment** | **str** |  | [optional] 
**doc_id** | **str** |  | [optional] 
**editor_link** | **str** |  | [optional] 
**end** | **int** |  | [optional] 
**in_source** | **bool** |  | [optional] 
**is_current** | **bool** |  | [optional] 
**module** | **str** |  | [optional] 
**project_id** | [**SimpleModel**](SimpleModel.md) |  | [optional] 
**severity** | **str** |  | [optional] 
**source** | **str** |  | [optional] 
**source_language** | [**SimpleModel**](SimpleModel.md) |  | [optional] 
**start** | **int** |  | [optional] 
**state** | **str** |  | [optional] 
**target_language** | [**SimpleModel**](SimpleModel.md) |  | [optional] 
**translation** | **str** |  | [optional] 
**unique_key** | **str** |  | [optional] 
**vendor** | [**SimpleModel**](SimpleModel.md) |  | [optional] 

## Example

```python
from openapi_client.models.qa_entry import QaEntry

# TODO update the JSON string below
json = "{}"
# create an instance of QaEntry from a JSON string
qa_entry_instance = QaEntry.from_json(json)
# print the JSON string representation of the object
print(QaEntry.to_json())

# convert the object into a dict
qa_entry_dict = qa_entry_instance.to_dict()
# create an instance of QaEntry from a dict
qa_entry_from_dict = QaEntry.from_dict(qa_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



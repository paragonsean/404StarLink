# FileAsData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **bytearray** | Base64 encoded contents of your file. | [optional] 
**name** | **str** | Name of your file | [optional] 

## Example

```python
from openapi_client.models.file_as_data import FileAsData

# TODO update the JSON string below
json = "{}"
# create an instance of FileAsData from a JSON string
file_as_data_instance = FileAsData.from_json(json)
# print the JSON string representation of the object
print(FileAsData.to_json())

# convert the object into a dict
file_as_data_dict = file_as_data_instance.to_dict()
# create an instance of FileAsData from a dict
file_as_data_from_dict = FileAsData.from_dict(file_as_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



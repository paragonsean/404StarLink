# PutRecordOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**record_id** | **str** |  | 
**encrypted** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.put_record_output import PutRecordOutput

# TODO update the JSON string below
json = "{}"
# create an instance of PutRecordOutput from a JSON string
put_record_output_instance = PutRecordOutput.from_json(json)
# print the JSON string representation of the object
print(PutRecordOutput.to_json())

# convert the object into a dict
put_record_output_dict = put_record_output_instance.to_dict()
# create an instance of PutRecordOutput from a dict
put_record_output_from_dict = PutRecordOutput.from_dict(put_record_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



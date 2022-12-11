# UseAsRegularPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_original_file_preview** | **bool** |  | [optional] 
**allow_review_in_manual_editor** | **bool** |  | [optional] 
**disable_invitations** | **bool** |  | [optional] 
**from_manual_translation_file_id** | **float** |  | [optional] 
**hide_numbers** | **bool** |  | [optional] 
**recreate** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.use_as_regular_payload import UseAsRegularPayload

# TODO update the JSON string below
json = "{}"
# create an instance of UseAsRegularPayload from a JSON string
use_as_regular_payload_instance = UseAsRegularPayload.from_json(json)
# print the JSON string representation of the object
print(UseAsRegularPayload.to_json())

# convert the object into a dict
use_as_regular_payload_dict = use_as_regular_payload_instance.to_dict()
# create an instance of UseAsRegularPayload from a dict
use_as_regular_payload_from_dict = UseAsRegularPayload.from_dict(use_as_regular_payload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



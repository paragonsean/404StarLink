# UseAsDraftPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from_file_id** | **float** |  | [optional] 
**from_manual_translation_file_id** | **float** |  | [optional] 
**to_manual_translation_file_id** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.use_as_draft_payload import UseAsDraftPayload

# TODO update the JSON string below
json = "{}"
# create an instance of UseAsDraftPayload from a JSON string
use_as_draft_payload_instance = UseAsDraftPayload.from_json(json)
# print the JSON string representation of the object
print(UseAsDraftPayload.to_json())

# convert the object into a dict
use_as_draft_payload_dict = use_as_draft_payload_instance.to_dict()
# create an instance of UseAsDraftPayload from a dict
use_as_draft_payload_from_dict = UseAsDraftPayload.from_dict(use_as_draft_payload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



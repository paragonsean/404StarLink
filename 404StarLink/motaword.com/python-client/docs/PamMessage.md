# PamMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | the message to be sent | [optional] 
**recipients** | **List[str]** | name of the recipients in the channel | [optional] 
**slots** | **List[str]** | contexts for next message | [optional] 
**thread_id** | **str** | id of the thread | [optional] 
**thread_key** | **str** | the key for thread_id default is project | [optional] 

## Example

```python
from openapi_client.models.pam_message import PamMessage

# TODO update the JSON string below
json = "{}"
# create an instance of PamMessage from a JSON string
pam_message_instance = PamMessage.from_json(json)
# print the JSON string representation of the object
print(PamMessage.to_json())

# convert the object into a dict
pam_message_dict = pam_message_instance.to_dict()
# create an instance of PamMessage from a dict
pam_message_from_dict = PamMessage.from_dict(pam_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



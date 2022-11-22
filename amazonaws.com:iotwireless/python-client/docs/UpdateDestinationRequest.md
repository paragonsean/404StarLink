# UpdateDestinationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression_type** | **str** | The type of value in &lt;code&gt;Expression&lt;/code&gt;. | [optional] 
**expression** | **str** | The new rule name or topic rule to send messages to. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**role_arn** | **str** | The ARN of the IAM Role that authorizes the destination. | [optional] 

## Example

```python
from openapi_client.models.update_destination_request import UpdateDestinationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateDestinationRequest from a JSON string
update_destination_request_instance = UpdateDestinationRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateDestinationRequest.to_json())

# convert the object into a dict
update_destination_request_dict = update_destination_request_instance.to_dict()
# create an instance of UpdateDestinationRequest from a dict
update_destination_request_from_dict = UpdateDestinationRequest.from_dict(update_destination_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



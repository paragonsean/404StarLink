# SendUserEmailConfirmation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** |  | [optional] [default to 'success']

## Example

```python
from openapi_client.models.send_user_email_confirmation200_response import SendUserEmailConfirmation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of SendUserEmailConfirmation200Response from a JSON string
send_user_email_confirmation200_response_instance = SendUserEmailConfirmation200Response.from_json(json)
# print the JSON string representation of the object
print(SendUserEmailConfirmation200Response.to_json())

# convert the object into a dict
send_user_email_confirmation200_response_dict = send_user_email_confirmation200_response_instance.to_dict()
# create an instance of SendUserEmailConfirmation200Response from a dict
send_user_email_confirmation200_response_from_dict = SendUserEmailConfirmation200Response.from_dict(send_user_email_confirmation200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



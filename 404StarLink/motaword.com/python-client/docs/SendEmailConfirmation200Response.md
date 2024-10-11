# SendEmailConfirmation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** |  | [optional] [default to 'success']

## Example

```python
from openapi_client.models.send_email_confirmation200_response import SendEmailConfirmation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of SendEmailConfirmation200Response from a JSON string
send_email_confirmation200_response_instance = SendEmailConfirmation200Response.from_json(json)
# print the JSON string representation of the object
print(SendEmailConfirmation200Response.to_json())

# convert the object into a dict
send_email_confirmation200_response_dict = send_email_confirmation200_response_instance.to_dict()
# create an instance of SendEmailConfirmation200Response from a dict
send_email_confirmation200_response_from_dict = SendEmailConfirmation200Response.from_dict(send_email_confirmation200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



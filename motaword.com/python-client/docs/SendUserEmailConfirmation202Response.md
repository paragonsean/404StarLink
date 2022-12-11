# SendUserEmailConfirmation202Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** |  | [optional] [default to 'already_confirmed']

## Example

```python
from openapi_client.models.send_user_email_confirmation202_response import SendUserEmailConfirmation202Response

# TODO update the JSON string below
json = "{}"
# create an instance of SendUserEmailConfirmation202Response from a JSON string
send_user_email_confirmation202_response_instance = SendUserEmailConfirmation202Response.from_json(json)
# print the JSON string representation of the object
print(SendUserEmailConfirmation202Response.to_json())

# convert the object into a dict
send_user_email_confirmation202_response_dict = send_user_email_confirmation202_response_instance.to_dict()
# create an instance of SendUserEmailConfirmation202Response from a dict
send_user_email_confirmation202_response_from_dict = SendUserEmailConfirmation202Response.from_dict(send_user_email_confirmation202_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



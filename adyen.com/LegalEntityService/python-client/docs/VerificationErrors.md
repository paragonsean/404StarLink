# VerificationErrors


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**problems** | [**List[CapabilityProblem]**](CapabilityProblem.md) | List of the verification errors. | [optional] 

## Example

```python
from openapi_client.models.verification_errors import VerificationErrors

# TODO update the JSON string below
json = "{}"
# create an instance of VerificationErrors from a JSON string
verification_errors_instance = VerificationErrors.from_json(json)
# print the JSON string representation of the object
print(VerificationErrors.to_json())

# convert the object into a dict
verification_errors_dict = verification_errors_instance.to_dict()
# create an instance of VerificationErrors from a dict
verification_errors_from_dict = VerificationErrors.from_dict(verification_errors_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



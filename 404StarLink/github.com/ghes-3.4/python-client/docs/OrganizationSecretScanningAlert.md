# OrganizationSecretScanningAlert


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] [readonly] 
**html_url** | **str** | The GitHub URL of the alert resource. | [optional] [readonly] 
**locations_url** | **str** | The REST API URL of the code locations for this alert. | [optional] 
**number** | **int** | The security alert number. | [optional] [readonly] 
**repository** | [**SimpleRepository**](SimpleRepository.md) |  | [optional] 
**resolution** | [**SecretScanningAlertResolution**](SecretScanningAlertResolution.md) |  | [optional] 
**resolved_at** | **datetime** | The time that the alert was resolved in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] 
**resolved_by** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | [optional] 
**secret** | **str** | The secret that was detected. | [optional] 
**secret_type** | **str** | The type of secret that secret scanning detected. | [optional] 
**state** | [**SecretScanningAlertState**](SecretScanningAlertState.md) |  | [optional] 
**updated_at** | **datetime** | The time that the alert was last updated in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] [readonly] 
**url** | **str** | The REST API URL of the alert resource. | [optional] [readonly] 

## Example

```python
from openapi_client.models.organization_secret_scanning_alert import OrganizationSecretScanningAlert

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationSecretScanningAlert from a JSON string
organization_secret_scanning_alert_instance = OrganizationSecretScanningAlert.from_json(json)
# print the JSON string representation of the object
print(OrganizationSecretScanningAlert.to_json())

# convert the object into a dict
organization_secret_scanning_alert_dict = organization_secret_scanning_alert_instance.to_dict()
# create an instance of OrganizationSecretScanningAlert from a dict
organization_secret_scanning_alert_from_dict = OrganizationSecretScanningAlert.from_dict(organization_secret_scanning_alert_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



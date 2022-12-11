# ProjectInSearch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average_scores** | **Dict[str, float]** |  | [optional] 
**budget_code** | **str** |  | [optional] 
**callback_url** | **str** | Callback URL to notify when project status changed. | [optional] 
**can_pam_manage** | **bool** |  | [optional] 
**client** | [**User**](User.md) |  | [optional] 
**cm_id** | **int** | Assigned admin&#39;s id | [optional] 
**completed_on** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**continuous_project_type** | **str** |  | [optional] 
**created_at** | **int** | Unix epoch time | [optional] 
**custom** | **object** | Custom data provided while creating a new project. | [optional] 
**delivery_at** | **int** | Unix epoch time | [optional] 
**errors** | [**List[Error]**](Error.md) | A list of errors. Visible when creating a project and uploading your documents at the same time, in case of multiple errors. | [optional] 
**id** | **int** |  | [optional] 
**is_api_project** | **bool** |  | [optional] 
**is_certified** | **bool** |  | [optional] 
**is_continuous** | **bool** |  | [optional] 
**is_manual** | **bool** |  | [optional] 
**links** | [**ProjectLinks**](ProjectLinks.md) |  | [optional] 
**pairs** | [**List[VendorProjectPair]**](VendorProjectPair.md) | Currently authed vendor&#39;s available working language pairs in this project. Includes rates per language pair. Includes complex pair logic such as bilingualism, project reverse pair enforcement etc. | [optional] 
**pivoted_projects** | **List[int]** | Quote IDs of pivots | [optional] 
**price** | [**ProjectPrice**](ProjectPrice.md) |  | [optional] 
**price_without_discount** | [**ProjectPrice**](ProjectPrice.md) |  | [optional] 
**role** | [**VendorProjectRole**](VendorProjectRole.md) |  | [optional] 
**should_send_client_survey** | **bool** |  | [optional] 
**source** | [**ProjectSource**](ProjectSource.md) |  | [optional] 
**source_language** | **str** |  | [optional] 
**status** | [**ProjectStatus**](ProjectStatus.md) |  | [optional] 
**subjects** | **List[str]** |  | [optional] 
**target_languages** | **List[str]** |  | [optional] 
**tms_name** | **str** | TMS project name for this MW project. Requires privileged scope. | [optional] 
**valid_until** | **int** | Unix epoch time. Available only if status is &#x60;pending&#x60;. | [optional] 
**vendor_word_count** | **int** |  | [optional] 
**word_count** | **int** |  | [optional] 
**word_count_analysis** | [**ProjectWordCountAnalysis**](ProjectWordCountAnalysis.md) |  | [optional] 
**search_result_reason** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.project_in_search import ProjectInSearch

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectInSearch from a JSON string
project_in_search_instance = ProjectInSearch.from_json(json)
# print the JSON string representation of the object
print(ProjectInSearch.to_json())

# convert the object into a dict
project_in_search_dict = project_in_search_instance.to_dict()
# create an instance of ProjectInSearch from a dict
project_in_search_from_dict = ProjectInSearch.from_dict(project_in_search_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)





# VexAssessment

VexAssessment provides all publisher provided Vex information that is related to this vulnerability.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cve** | **String** | Holds the MITRE standard Common Vulnerabilities and Exposures (CVE) tracking number for the vulnerability. |  [optional] |
|**impacts** | **List&lt;String&gt;** | Contains information about the impact of this vulnerability, this will change with time. |  [optional] |
|**justification** | [**Justification**](Justification.md) |  |  [optional] |
|**noteName** | **String** | The VulnerabilityAssessment note from which this VexAssessment was generated. This will be of the form: &#x60;projects/[PROJECT_ID]/notes/[NOTE_ID]&#x60;. |  [optional] |
|**relatedUris** | [**List&lt;RelatedUrl&gt;**](RelatedUrl.md) | Holds a list of references associated with this vulnerability item and assessment. |  [optional] |
|**remediations** | [**List&lt;Remediation&gt;**](Remediation.md) | Specifies details on how to handle (and presumably, fix) a vulnerability. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Provides the state of this Vulnerability assessment. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| AFFECTED | &quot;AFFECTED&quot; |
| NOT_AFFECTED | &quot;NOT_AFFECTED&quot; |
| FIXED | &quot;FIXED&quot; |
| UNDER_INVESTIGATION | &quot;UNDER_INVESTIGATION&quot; |




# coding: utf-8

"""
    Android Management API

    The Android Management API provides remote enterprise management of Android devices and apps.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.application_report import ApplicationReport
from openapi_client.models.common_criteria_mode_info import CommonCriteriaModeInfo
from openapi_client.models.device_settings import DeviceSettings
from openapi_client.models.display import Display
from openapi_client.models.hardware_info import HardwareInfo
from openapi_client.models.hardware_status import HardwareStatus
from openapi_client.models.memory_event import MemoryEvent
from openapi_client.models.memory_info import MemoryInfo
from openapi_client.models.network_info import NetworkInfo
from openapi_client.models.non_compliance_detail import NonComplianceDetail
from openapi_client.models.password_requirements import PasswordRequirements
from openapi_client.models.power_management_event import PowerManagementEvent
from openapi_client.models.security_posture import SecurityPosture
from openapi_client.models.software_info import SoftwareInfo
from openapi_client.models.user import User
from openapi_client.models.user_facing_message import UserFacingMessage
from typing import Optional, Set
from typing_extensions import Self

class Device(BaseModel):
    """
    A device owned by an enterprise. Unless otherwise noted, all fields are read-only and can't be modified by enterprises.devices.patch.
    """ # noqa: E501
    api_level: Optional[StrictInt] = Field(default=None, description="The API level of the Android platform version running on the device.", alias="apiLevel")
    application_reports: Optional[List[ApplicationReport]] = Field(default=None, description="Reports for apps installed on the device. This information is only available when application_reports_enabled is true in the device's policy.", alias="applicationReports")
    applied_password_policies: Optional[List[PasswordRequirements]] = Field(default=None, description="The password requirements currently applied to the device. The applied requirements may be slightly different from those specified in passwordPolicies in some cases. fieldPath is set based on passwordPolicies.", alias="appliedPasswordPolicies")
    applied_policy_name: Optional[StrictStr] = Field(default=None, description="The name of the policy currently applied to the device.", alias="appliedPolicyName")
    applied_policy_version: Optional[StrictStr] = Field(default=None, description="The version of the policy currently applied to the device.", alias="appliedPolicyVersion")
    applied_state: Optional[StrictStr] = Field(default=None, description="The state currently applied to the device.", alias="appliedState")
    common_criteria_mode_info: Optional[CommonCriteriaModeInfo] = Field(default=None, alias="commonCriteriaModeInfo")
    device_settings: Optional[DeviceSettings] = Field(default=None, alias="deviceSettings")
    disabled_reason: Optional[UserFacingMessage] = Field(default=None, alias="disabledReason")
    displays: Optional[List[Display]] = Field(default=None, description="Detailed information about displays on the device. This information is only available if displayInfoEnabled is true in the device's policy.")
    enrollment_time: Optional[StrictStr] = Field(default=None, description="The time of device enrollment.", alias="enrollmentTime")
    enrollment_token_data: Optional[StrictStr] = Field(default=None, description="If the device was enrolled with an enrollment token with additional data provided, this field contains that data.", alias="enrollmentTokenData")
    enrollment_token_name: Optional[StrictStr] = Field(default=None, description="If the device was enrolled with an enrollment token, this field contains the name of the token.", alias="enrollmentTokenName")
    hardware_info: Optional[HardwareInfo] = Field(default=None, alias="hardwareInfo")
    hardware_status_samples: Optional[List[HardwareStatus]] = Field(default=None, description="Hardware status samples in chronological order. This information is only available if hardwareStatusEnabled is true in the device's policy.", alias="hardwareStatusSamples")
    last_policy_compliance_report_time: Optional[StrictStr] = Field(default=None, description="Deprecated.", alias="lastPolicyComplianceReportTime")
    last_policy_sync_time: Optional[StrictStr] = Field(default=None, description="The last time the device fetched its policy.", alias="lastPolicySyncTime")
    last_status_report_time: Optional[StrictStr] = Field(default=None, description="The last time the device sent a status report.", alias="lastStatusReportTime")
    management_mode: Optional[StrictStr] = Field(default=None, description="The type of management mode Android Device Policy takes on the device. This influences which policy settings are supported.", alias="managementMode")
    memory_events: Optional[List[MemoryEvent]] = Field(default=None, description="Events related to memory and storage measurements in chronological order. This information is only available if memoryInfoEnabled is true in the device's policy.", alias="memoryEvents")
    memory_info: Optional[MemoryInfo] = Field(default=None, alias="memoryInfo")
    name: Optional[StrictStr] = Field(default=None, description="The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId}.")
    network_info: Optional[NetworkInfo] = Field(default=None, alias="networkInfo")
    non_compliance_details: Optional[List[NonComplianceDetail]] = Field(default=None, description="Details about policy settings that the device is not compliant with.", alias="nonComplianceDetails")
    ownership: Optional[StrictStr] = Field(default=None, description="Ownership of the managed device.")
    policy_compliant: Optional[StrictBool] = Field(default=None, description="Whether the device is compliant with its policy.", alias="policyCompliant")
    policy_name: Optional[StrictStr] = Field(default=None, description="The name of the policy applied to the device, in the form enterprises/{enterpriseId}/policies/{policyId}. If not specified, the policy_name for the device's user is applied. This field can be modified by a patch request. You can specify only the policyId when calling enterprises.devices.patch, as long as the policyId doesn’t contain any slashes. The rest of the policy name is inferred.", alias="policyName")
    power_management_events: Optional[List[PowerManagementEvent]] = Field(default=None, description="Power management events on the device in chronological order. This information is only available if powerManagementEventsEnabled is true in the device's policy.", alias="powerManagementEvents")
    previous_device_names: Optional[List[StrictStr]] = Field(default=None, description="If the same physical device has been enrolled multiple times, this field contains its previous device names. The serial number is used as the unique identifier to determine if the same physical device has enrolled previously. The names are in chronological order.", alias="previousDeviceNames")
    security_posture: Optional[SecurityPosture] = Field(default=None, alias="securityPosture")
    software_info: Optional[SoftwareInfo] = Field(default=None, alias="softwareInfo")
    state: Optional[StrictStr] = Field(default=None, description="The state to be applied to the device. This field can be modified by a patch request. Note that when calling enterprises.devices.patch, ACTIVE and DISABLED are the only allowable values. To enter the device into a DELETED state, call enterprises.devices.delete.")
    system_properties: Optional[Dict[str, StrictStr]] = Field(default=None, description="Map of selected system properties name and value related to the device. This information is only available if systemPropertiesEnabled is true in the device's policy.", alias="systemProperties")
    user: Optional[User] = None
    user_name: Optional[StrictStr] = Field(default=None, description="The resource name of the user that owns this device in the form enterprises/{enterpriseId}/users/{userId}.", alias="userName")
    __properties: ClassVar[List[str]] = ["apiLevel", "applicationReports", "appliedPasswordPolicies", "appliedPolicyName", "appliedPolicyVersion", "appliedState", "commonCriteriaModeInfo", "deviceSettings", "disabledReason", "displays", "enrollmentTime", "enrollmentTokenData", "enrollmentTokenName", "hardwareInfo", "hardwareStatusSamples", "lastPolicyComplianceReportTime", "lastPolicySyncTime", "lastStatusReportTime", "managementMode", "memoryEvents", "memoryInfo", "name", "networkInfo", "nonComplianceDetails", "ownership", "policyCompliant", "policyName", "powerManagementEvents", "previousDeviceNames", "securityPosture", "softwareInfo", "state", "systemProperties", "user", "userName"]

    @field_validator('applied_state')
    def applied_state_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['DEVICE_STATE_UNSPECIFIED', 'ACTIVE', 'DISABLED', 'DELETED', 'PROVISIONING']):
            raise ValueError("must be one of enum values ('DEVICE_STATE_UNSPECIFIED', 'ACTIVE', 'DISABLED', 'DELETED', 'PROVISIONING')")
        return value

    @field_validator('management_mode')
    def management_mode_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['MANAGEMENT_MODE_UNSPECIFIED', 'DEVICE_OWNER', 'PROFILE_OWNER']):
            raise ValueError("must be one of enum values ('MANAGEMENT_MODE_UNSPECIFIED', 'DEVICE_OWNER', 'PROFILE_OWNER')")
        return value

    @field_validator('ownership')
    def ownership_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['OWNERSHIP_UNSPECIFIED', 'COMPANY_OWNED', 'PERSONALLY_OWNED']):
            raise ValueError("must be one of enum values ('OWNERSHIP_UNSPECIFIED', 'COMPANY_OWNED', 'PERSONALLY_OWNED')")
        return value

    @field_validator('state')
    def state_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['DEVICE_STATE_UNSPECIFIED', 'ACTIVE', 'DISABLED', 'DELETED', 'PROVISIONING']):
            raise ValueError("must be one of enum values ('DEVICE_STATE_UNSPECIFIED', 'ACTIVE', 'DISABLED', 'DELETED', 'PROVISIONING')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of Device from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in application_reports (list)
        _items = []
        if self.application_reports:
            for _item_application_reports in self.application_reports:
                if _item_application_reports:
                    _items.append(_item_application_reports.to_dict())
            _dict['applicationReports'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in applied_password_policies (list)
        _items = []
        if self.applied_password_policies:
            for _item_applied_password_policies in self.applied_password_policies:
                if _item_applied_password_policies:
                    _items.append(_item_applied_password_policies.to_dict())
            _dict['appliedPasswordPolicies'] = _items
        # override the default output from pydantic by calling `to_dict()` of common_criteria_mode_info
        if self.common_criteria_mode_info:
            _dict['commonCriteriaModeInfo'] = self.common_criteria_mode_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of device_settings
        if self.device_settings:
            _dict['deviceSettings'] = self.device_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of disabled_reason
        if self.disabled_reason:
            _dict['disabledReason'] = self.disabled_reason.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in displays (list)
        _items = []
        if self.displays:
            for _item_displays in self.displays:
                if _item_displays:
                    _items.append(_item_displays.to_dict())
            _dict['displays'] = _items
        # override the default output from pydantic by calling `to_dict()` of hardware_info
        if self.hardware_info:
            _dict['hardwareInfo'] = self.hardware_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in hardware_status_samples (list)
        _items = []
        if self.hardware_status_samples:
            for _item_hardware_status_samples in self.hardware_status_samples:
                if _item_hardware_status_samples:
                    _items.append(_item_hardware_status_samples.to_dict())
            _dict['hardwareStatusSamples'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in memory_events (list)
        _items = []
        if self.memory_events:
            for _item_memory_events in self.memory_events:
                if _item_memory_events:
                    _items.append(_item_memory_events.to_dict())
            _dict['memoryEvents'] = _items
        # override the default output from pydantic by calling `to_dict()` of memory_info
        if self.memory_info:
            _dict['memoryInfo'] = self.memory_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of network_info
        if self.network_info:
            _dict['networkInfo'] = self.network_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in non_compliance_details (list)
        _items = []
        if self.non_compliance_details:
            for _item_non_compliance_details in self.non_compliance_details:
                if _item_non_compliance_details:
                    _items.append(_item_non_compliance_details.to_dict())
            _dict['nonComplianceDetails'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in power_management_events (list)
        _items = []
        if self.power_management_events:
            for _item_power_management_events in self.power_management_events:
                if _item_power_management_events:
                    _items.append(_item_power_management_events.to_dict())
            _dict['powerManagementEvents'] = _items
        # override the default output from pydantic by calling `to_dict()` of security_posture
        if self.security_posture:
            _dict['securityPosture'] = self.security_posture.to_dict()
        # override the default output from pydantic by calling `to_dict()` of software_info
        if self.software_info:
            _dict['softwareInfo'] = self.software_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of user
        if self.user:
            _dict['user'] = self.user.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Device from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "apiLevel": obj.get("apiLevel"),
            "applicationReports": [ApplicationReport.from_dict(_item) for _item in obj["applicationReports"]] if obj.get("applicationReports") is not None else None,
            "appliedPasswordPolicies": [PasswordRequirements.from_dict(_item) for _item in obj["appliedPasswordPolicies"]] if obj.get("appliedPasswordPolicies") is not None else None,
            "appliedPolicyName": obj.get("appliedPolicyName"),
            "appliedPolicyVersion": obj.get("appliedPolicyVersion"),
            "appliedState": obj.get("appliedState"),
            "commonCriteriaModeInfo": CommonCriteriaModeInfo.from_dict(obj["commonCriteriaModeInfo"]) if obj.get("commonCriteriaModeInfo") is not None else None,
            "deviceSettings": DeviceSettings.from_dict(obj["deviceSettings"]) if obj.get("deviceSettings") is not None else None,
            "disabledReason": UserFacingMessage.from_dict(obj["disabledReason"]) if obj.get("disabledReason") is not None else None,
            "displays": [Display.from_dict(_item) for _item in obj["displays"]] if obj.get("displays") is not None else None,
            "enrollmentTime": obj.get("enrollmentTime"),
            "enrollmentTokenData": obj.get("enrollmentTokenData"),
            "enrollmentTokenName": obj.get("enrollmentTokenName"),
            "hardwareInfo": HardwareInfo.from_dict(obj["hardwareInfo"]) if obj.get("hardwareInfo") is not None else None,
            "hardwareStatusSamples": [HardwareStatus.from_dict(_item) for _item in obj["hardwareStatusSamples"]] if obj.get("hardwareStatusSamples") is not None else None,
            "lastPolicyComplianceReportTime": obj.get("lastPolicyComplianceReportTime"),
            "lastPolicySyncTime": obj.get("lastPolicySyncTime"),
            "lastStatusReportTime": obj.get("lastStatusReportTime"),
            "managementMode": obj.get("managementMode"),
            "memoryEvents": [MemoryEvent.from_dict(_item) for _item in obj["memoryEvents"]] if obj.get("memoryEvents") is not None else None,
            "memoryInfo": MemoryInfo.from_dict(obj["memoryInfo"]) if obj.get("memoryInfo") is not None else None,
            "name": obj.get("name"),
            "networkInfo": NetworkInfo.from_dict(obj["networkInfo"]) if obj.get("networkInfo") is not None else None,
            "nonComplianceDetails": [NonComplianceDetail.from_dict(_item) for _item in obj["nonComplianceDetails"]] if obj.get("nonComplianceDetails") is not None else None,
            "ownership": obj.get("ownership"),
            "policyCompliant": obj.get("policyCompliant"),
            "policyName": obj.get("policyName"),
            "powerManagementEvents": [PowerManagementEvent.from_dict(_item) for _item in obj["powerManagementEvents"]] if obj.get("powerManagementEvents") is not None else None,
            "previousDeviceNames": obj.get("previousDeviceNames"),
            "securityPosture": SecurityPosture.from_dict(obj["securityPosture"]) if obj.get("securityPosture") is not None else None,
            "softwareInfo": SoftwareInfo.from_dict(obj["softwareInfo"]) if obj.get("softwareInfo") is not None else None,
            "state": obj.get("state"),
            "systemProperties": obj.get("systemProperties"),
            "user": User.from_dict(obj["user"]) if obj.get("user") is not None else None,
            "userName": obj.get("userName")
        })
        return _obj



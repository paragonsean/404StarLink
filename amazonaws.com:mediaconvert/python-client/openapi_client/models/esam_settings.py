# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.esam_settings_manifest_confirm_condition_notification import EsamSettingsManifestConfirmConditionNotification
from openapi_client.models.esam_settings_signal_processing_notification import EsamSettingsSignalProcessingNotification
from typing import Optional, Set
from typing_extensions import Self

class EsamSettings(BaseModel):
    """
    Settings for Event Signaling And Messaging (ESAM). If you don't do ad insertion, you can ignore these settings.
    """ # noqa: E501
    manifest_confirm_condition_notification: Optional[EsamSettingsManifestConfirmConditionNotification] = Field(default=None, alias="ManifestConfirmConditionNotification")
    response_signal_preroll: Optional[Any] = Field(default=None, alias="ResponseSignalPreroll")
    signal_processing_notification: Optional[EsamSettingsSignalProcessingNotification] = Field(default=None, alias="SignalProcessingNotification")
    __properties: ClassVar[List[str]] = ["ManifestConfirmConditionNotification", "ResponseSignalPreroll", "SignalProcessingNotification"]

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
        """Create an instance of EsamSettings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of manifest_confirm_condition_notification
        if self.manifest_confirm_condition_notification:
            _dict['ManifestConfirmConditionNotification'] = self.manifest_confirm_condition_notification.to_dict()
        # override the default output from pydantic by calling `to_dict()` of signal_processing_notification
        if self.signal_processing_notification:
            _dict['SignalProcessingNotification'] = self.signal_processing_notification.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of EsamSettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ManifestConfirmConditionNotification": EsamSettingsManifestConfirmConditionNotification.from_dict(obj["ManifestConfirmConditionNotification"]) if obj.get("ManifestConfirmConditionNotification") is not None else None,
            "ResponseSignalPreroll": obj.get("ResponseSignalPreroll"),
            "SignalProcessingNotification": EsamSettingsSignalProcessingNotification.from_dict(obj["SignalProcessingNotification"]) if obj.get("SignalProcessingNotification") is not None else None
        })
        return _obj



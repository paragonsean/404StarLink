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
from openapi_client.models.avc_intra_uhd_quality_tuning_level import AvcIntraUhdQualityTuningLevel
from typing import Optional, Set
from typing_extensions import Self

class AvcIntraSettingsAvcIntraUhdSettings(BaseModel):
    """
    AvcIntraSettingsAvcIntraUhdSettings
    """ # noqa: E501
    quality_tuning_level: Optional[Any] = Field(default=None, alias="QualityTuningLevel")
    __properties: ClassVar[List[str]] = ["QualityTuningLevel"]

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
        """Create an instance of AvcIntraSettingsAvcIntraUhdSettings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of quality_tuning_level
        if self.quality_tuning_level:
            _dict['QualityTuningLevel'] = self.quality_tuning_level.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AvcIntraSettingsAvcIntraUhdSettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "QualityTuningLevel": AvcIntraUhdQualityTuningLevel.from_dict(obj["QualityTuningLevel"]) if obj.get("QualityTuningLevel") is not None else None
        })
        return _obj



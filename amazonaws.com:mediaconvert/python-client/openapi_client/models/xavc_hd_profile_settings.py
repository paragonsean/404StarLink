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
from typing import Optional, Set
from typing_extensions import Self

class XavcHdProfileSettings(BaseModel):
    """
    Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value XAVC_HD.
    """ # noqa: E501
    bitrate_class: Optional[Any] = Field(default=None, alias="BitrateClass")
    flicker_adaptive_quantization: Optional[Any] = Field(default=None, alias="FlickerAdaptiveQuantization")
    gop_b_reference: Optional[Any] = Field(default=None, alias="GopBReference")
    gop_closed_cadence: Optional[Any] = Field(default=None, alias="GopClosedCadence")
    hrd_buffer_size: Optional[Any] = Field(default=None, alias="HrdBufferSize")
    interlace_mode: Optional[Any] = Field(default=None, alias="InterlaceMode")
    quality_tuning_level: Optional[Any] = Field(default=None, alias="QualityTuningLevel")
    slices: Optional[Any] = Field(default=None, alias="Slices")
    telecine: Optional[Any] = Field(default=None, alias="Telecine")
    __properties: ClassVar[List[str]] = ["BitrateClass", "FlickerAdaptiveQuantization", "GopBReference", "GopClosedCadence", "HrdBufferSize", "InterlaceMode", "QualityTuningLevel", "Slices", "Telecine"]

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
        """Create an instance of XavcHdProfileSettings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of bitrate_class
        if self.bitrate_class:
            _dict['BitrateClass'] = self.bitrate_class.to_dict()
        # override the default output from pydantic by calling `to_dict()` of flicker_adaptive_quantization
        if self.flicker_adaptive_quantization:
            _dict['FlickerAdaptiveQuantization'] = self.flicker_adaptive_quantization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of gop_b_reference
        if self.gop_b_reference:
            _dict['GopBReference'] = self.gop_b_reference.to_dict()
        # override the default output from pydantic by calling `to_dict()` of interlace_mode
        if self.interlace_mode:
            _dict['InterlaceMode'] = self.interlace_mode.to_dict()
        # override the default output from pydantic by calling `to_dict()` of quality_tuning_level
        if self.quality_tuning_level:
            _dict['QualityTuningLevel'] = self.quality_tuning_level.to_dict()
        # override the default output from pydantic by calling `to_dict()` of telecine
        if self.telecine:
            _dict['Telecine'] = self.telecine.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of XavcHdProfileSettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "BitrateClass": XavcHdProfileBitrateClass.from_dict(obj["BitrateClass"]) if obj.get("BitrateClass") is not None else None,
            "FlickerAdaptiveQuantization": XavcFlickerAdaptiveQuantization.from_dict(obj["FlickerAdaptiveQuantization"]) if obj.get("FlickerAdaptiveQuantization") is not None else None,
            "GopBReference": XavcGopBReference.from_dict(obj["GopBReference"]) if obj.get("GopBReference") is not None else None,
            "GopClosedCadence": obj.get("GopClosedCadence"),
            "HrdBufferSize": obj.get("HrdBufferSize"),
            "InterlaceMode": XavcInterlaceMode.from_dict(obj["InterlaceMode"]) if obj.get("InterlaceMode") is not None else None,
            "QualityTuningLevel": XavcHdProfileQualityTuningLevel.from_dict(obj["QualityTuningLevel"]) if obj.get("QualityTuningLevel") is not None else None,
            "Slices": obj.get("Slices"),
            "Telecine": XavcHdProfileTelecine.from_dict(obj["Telecine"]) if obj.get("Telecine") is not None else None
        })
        return _obj



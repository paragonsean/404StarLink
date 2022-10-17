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
from openapi_client.models.input_crop import InputCrop
from openapi_client.models.input_decryption_settings import InputDecryptionSettings
from openapi_client.models.input_image_inserter import InputImageInserter
from openapi_client.models.input_position import InputPosition
from openapi_client.models.input_video_generator import InputVideoGenerator
from openapi_client.models.input_video_selector import InputVideoSelector
from typing import Optional, Set
from typing_extensions import Self

class Input(BaseModel):
    """
    Use inputs to define the source files used in your transcoding job. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/specify-input-settings.html. You can use multiple video inputs to do input stitching. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/assembling-multiple-inputs-and-input-clips.html
    """ # noqa: E501
    audio_selector_groups: Optional[Any] = Field(default=None, alias="AudioSelectorGroups")
    audio_selectors: Optional[Any] = Field(default=None, alias="AudioSelectors")
    caption_selectors: Optional[Any] = Field(default=None, alias="CaptionSelectors")
    crop: Optional[InputCrop] = Field(default=None, alias="Crop")
    deblock_filter: Optional[Any] = Field(default=None, alias="DeblockFilter")
    decryption_settings: Optional[InputDecryptionSettings] = Field(default=None, alias="DecryptionSettings")
    denoise_filter: Optional[Any] = Field(default=None, alias="DenoiseFilter")
    dolby_vision_metadata_xml: Optional[Any] = Field(default=None, alias="DolbyVisionMetadataXml")
    file_input: Optional[Any] = Field(default=None, alias="FileInput")
    filter_enable: Optional[Any] = Field(default=None, alias="FilterEnable")
    filter_strength: Optional[Any] = Field(default=None, alias="FilterStrength")
    image_inserter: Optional[InputImageInserter] = Field(default=None, alias="ImageInserter")
    input_clippings: Optional[Any] = Field(default=None, alias="InputClippings")
    input_scan_type: Optional[Any] = Field(default=None, alias="InputScanType")
    position: Optional[InputPosition] = Field(default=None, alias="Position")
    program_number: Optional[Any] = Field(default=None, alias="ProgramNumber")
    psi_control: Optional[Any] = Field(default=None, alias="PsiControl")
    supplemental_imps: Optional[Any] = Field(default=None, alias="SupplementalImps")
    timecode_source: Optional[Any] = Field(default=None, alias="TimecodeSource")
    timecode_start: Optional[Any] = Field(default=None, alias="TimecodeStart")
    video_generator: Optional[InputVideoGenerator] = Field(default=None, alias="VideoGenerator")
    video_selector: Optional[InputVideoSelector] = Field(default=None, alias="VideoSelector")
    __properties: ClassVar[List[str]] = ["AudioSelectorGroups", "AudioSelectors", "CaptionSelectors", "Crop", "DeblockFilter", "DecryptionSettings", "DenoiseFilter", "DolbyVisionMetadataXml", "FileInput", "FilterEnable", "FilterStrength", "ImageInserter", "InputClippings", "InputScanType", "Position", "ProgramNumber", "PsiControl", "SupplementalImps", "TimecodeSource", "TimecodeStart", "VideoGenerator", "VideoSelector"]

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
        """Create an instance of Input from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of crop
        if self.crop:
            _dict['Crop'] = self.crop.to_dict()
        # override the default output from pydantic by calling `to_dict()` of deblock_filter
        if self.deblock_filter:
            _dict['DeblockFilter'] = self.deblock_filter.to_dict()
        # override the default output from pydantic by calling `to_dict()` of decryption_settings
        if self.decryption_settings:
            _dict['DecryptionSettings'] = self.decryption_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of denoise_filter
        if self.denoise_filter:
            _dict['DenoiseFilter'] = self.denoise_filter.to_dict()
        # override the default output from pydantic by calling `to_dict()` of filter_enable
        if self.filter_enable:
            _dict['FilterEnable'] = self.filter_enable.to_dict()
        # override the default output from pydantic by calling `to_dict()` of image_inserter
        if self.image_inserter:
            _dict['ImageInserter'] = self.image_inserter.to_dict()
        # override the default output from pydantic by calling `to_dict()` of input_scan_type
        if self.input_scan_type:
            _dict['InputScanType'] = self.input_scan_type.to_dict()
        # override the default output from pydantic by calling `to_dict()` of position
        if self.position:
            _dict['Position'] = self.position.to_dict()
        # override the default output from pydantic by calling `to_dict()` of psi_control
        if self.psi_control:
            _dict['PsiControl'] = self.psi_control.to_dict()
        # override the default output from pydantic by calling `to_dict()` of timecode_source
        if self.timecode_source:
            _dict['TimecodeSource'] = self.timecode_source.to_dict()
        # override the default output from pydantic by calling `to_dict()` of video_generator
        if self.video_generator:
            _dict['VideoGenerator'] = self.video_generator.to_dict()
        # override the default output from pydantic by calling `to_dict()` of video_selector
        if self.video_selector:
            _dict['VideoSelector'] = self.video_selector.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Input from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "AudioSelectorGroups": obj.get("AudioSelectorGroups"),
            "AudioSelectors": obj.get("AudioSelectors"),
            "CaptionSelectors": obj.get("CaptionSelectors"),
            "Crop": InputCrop.from_dict(obj["Crop"]) if obj.get("Crop") is not None else None,
            "DeblockFilter": InputDeblockFilter.from_dict(obj["DeblockFilter"]) if obj.get("DeblockFilter") is not None else None,
            "DecryptionSettings": InputDecryptionSettings.from_dict(obj["DecryptionSettings"]) if obj.get("DecryptionSettings") is not None else None,
            "DenoiseFilter": InputDenoiseFilter.from_dict(obj["DenoiseFilter"]) if obj.get("DenoiseFilter") is not None else None,
            "DolbyVisionMetadataXml": obj.get("DolbyVisionMetadataXml"),
            "FileInput": obj.get("FileInput"),
            "FilterEnable": InputFilterEnable.from_dict(obj["FilterEnable"]) if obj.get("FilterEnable") is not None else None,
            "FilterStrength": obj.get("FilterStrength"),
            "ImageInserter": InputImageInserter.from_dict(obj["ImageInserter"]) if obj.get("ImageInserter") is not None else None,
            "InputClippings": obj.get("InputClippings"),
            "InputScanType": InputScanType.from_dict(obj["InputScanType"]) if obj.get("InputScanType") is not None else None,
            "Position": InputPosition.from_dict(obj["Position"]) if obj.get("Position") is not None else None,
            "ProgramNumber": obj.get("ProgramNumber"),
            "PsiControl": InputPsiControl.from_dict(obj["PsiControl"]) if obj.get("PsiControl") is not None else None,
            "SupplementalImps": obj.get("SupplementalImps"),
            "TimecodeSource": InputTimecodeSource.from_dict(obj["TimecodeSource"]) if obj.get("TimecodeSource") is not None else None,
            "TimecodeStart": obj.get("TimecodeStart"),
            "VideoGenerator": InputVideoGenerator.from_dict(obj["VideoGenerator"]) if obj.get("VideoGenerator") is not None else None,
            "VideoSelector": InputVideoSelector.from_dict(obj["VideoSelector"]) if obj.get("VideoSelector") is not None else None
        })
        return _obj



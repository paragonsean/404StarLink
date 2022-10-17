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
from openapi_client.models.cmaf_group_settings_destination_settings import CmafGroupSettingsDestinationSettings
from openapi_client.models.dash_iso_group_settings_encryption import DashIsoGroupSettingsEncryption
from openapi_client.models.dash_iso_group_settings_image_based_trick_play_settings import DashIsoGroupSettingsImageBasedTrickPlaySettings
from typing import Optional, Set
from typing_extensions import Self

class DashIsoGroupSettings(BaseModel):
    """
    Settings related to your DASH output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to DASH_ISO_GROUP_SETTINGS.
    """ # noqa: E501
    additional_manifests: Optional[Any] = Field(default=None, alias="AdditionalManifests")
    audio_channel_config_scheme_id_uri: Optional[Any] = Field(default=None, alias="AudioChannelConfigSchemeIdUri")
    base_url: Optional[Any] = Field(default=None, alias="BaseUrl")
    dash_manifest_style: Optional[Any] = Field(default=None, alias="DashManifestStyle")
    destination: Optional[Any] = Field(default=None, alias="Destination")
    destination_settings: Optional[CmafGroupSettingsDestinationSettings] = Field(default=None, alias="DestinationSettings")
    encryption: Optional[DashIsoGroupSettingsEncryption] = Field(default=None, alias="Encryption")
    fragment_length: Optional[Any] = Field(default=None, alias="FragmentLength")
    hbbtv_compliance: Optional[Any] = Field(default=None, alias="HbbtvCompliance")
    image_based_trick_play: Optional[Any] = Field(default=None, alias="ImageBasedTrickPlay")
    image_based_trick_play_settings: Optional[DashIsoGroupSettingsImageBasedTrickPlaySettings] = Field(default=None, alias="ImageBasedTrickPlaySettings")
    min_buffer_time: Optional[Any] = Field(default=None, alias="MinBufferTime")
    min_final_segment_length: Optional[Any] = Field(default=None, alias="MinFinalSegmentLength")
    mpd_manifest_bandwidth_type: Optional[Any] = Field(default=None, alias="MpdManifestBandwidthType")
    mpd_profile: Optional[Any] = Field(default=None, alias="MpdProfile")
    pts_offset_handling_for_b_frames: Optional[Any] = Field(default=None, alias="PtsOffsetHandlingForBFrames")
    segment_control: Optional[Any] = Field(default=None, alias="SegmentControl")
    segment_length: Optional[Any] = Field(default=None, alias="SegmentLength")
    segment_length_control: Optional[Any] = Field(default=None, alias="SegmentLengthControl")
    video_composition_offsets: Optional[Any] = Field(default=None, alias="VideoCompositionOffsets")
    write_segment_timeline_in_representation: Optional[Any] = Field(default=None, alias="WriteSegmentTimelineInRepresentation")
    __properties: ClassVar[List[str]] = ["AdditionalManifests", "AudioChannelConfigSchemeIdUri", "BaseUrl", "DashManifestStyle", "Destination", "DestinationSettings", "Encryption", "FragmentLength", "HbbtvCompliance", "ImageBasedTrickPlay", "ImageBasedTrickPlaySettings", "MinBufferTime", "MinFinalSegmentLength", "MpdManifestBandwidthType", "MpdProfile", "PtsOffsetHandlingForBFrames", "SegmentControl", "SegmentLength", "SegmentLengthControl", "VideoCompositionOffsets", "WriteSegmentTimelineInRepresentation"]

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
        """Create an instance of DashIsoGroupSettings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of audio_channel_config_scheme_id_uri
        if self.audio_channel_config_scheme_id_uri:
            _dict['AudioChannelConfigSchemeIdUri'] = self.audio_channel_config_scheme_id_uri.to_dict()
        # override the default output from pydantic by calling `to_dict()` of dash_manifest_style
        if self.dash_manifest_style:
            _dict['DashManifestStyle'] = self.dash_manifest_style.to_dict()
        # override the default output from pydantic by calling `to_dict()` of destination_settings
        if self.destination_settings:
            _dict['DestinationSettings'] = self.destination_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of encryption
        if self.encryption:
            _dict['Encryption'] = self.encryption.to_dict()
        # override the default output from pydantic by calling `to_dict()` of hbbtv_compliance
        if self.hbbtv_compliance:
            _dict['HbbtvCompliance'] = self.hbbtv_compliance.to_dict()
        # override the default output from pydantic by calling `to_dict()` of image_based_trick_play
        if self.image_based_trick_play:
            _dict['ImageBasedTrickPlay'] = self.image_based_trick_play.to_dict()
        # override the default output from pydantic by calling `to_dict()` of image_based_trick_play_settings
        if self.image_based_trick_play_settings:
            _dict['ImageBasedTrickPlaySettings'] = self.image_based_trick_play_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of mpd_manifest_bandwidth_type
        if self.mpd_manifest_bandwidth_type:
            _dict['MpdManifestBandwidthType'] = self.mpd_manifest_bandwidth_type.to_dict()
        # override the default output from pydantic by calling `to_dict()` of mpd_profile
        if self.mpd_profile:
            _dict['MpdProfile'] = self.mpd_profile.to_dict()
        # override the default output from pydantic by calling `to_dict()` of pts_offset_handling_for_b_frames
        if self.pts_offset_handling_for_b_frames:
            _dict['PtsOffsetHandlingForBFrames'] = self.pts_offset_handling_for_b_frames.to_dict()
        # override the default output from pydantic by calling `to_dict()` of segment_control
        if self.segment_control:
            _dict['SegmentControl'] = self.segment_control.to_dict()
        # override the default output from pydantic by calling `to_dict()` of segment_length_control
        if self.segment_length_control:
            _dict['SegmentLengthControl'] = self.segment_length_control.to_dict()
        # override the default output from pydantic by calling `to_dict()` of video_composition_offsets
        if self.video_composition_offsets:
            _dict['VideoCompositionOffsets'] = self.video_composition_offsets.to_dict()
        # override the default output from pydantic by calling `to_dict()` of write_segment_timeline_in_representation
        if self.write_segment_timeline_in_representation:
            _dict['WriteSegmentTimelineInRepresentation'] = self.write_segment_timeline_in_representation.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of DashIsoGroupSettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "AdditionalManifests": obj.get("AdditionalManifests"),
            "AudioChannelConfigSchemeIdUri": DashIsoGroupAudioChannelConfigSchemeIdUri.from_dict(obj["AudioChannelConfigSchemeIdUri"]) if obj.get("AudioChannelConfigSchemeIdUri") is not None else None,
            "BaseUrl": obj.get("BaseUrl"),
            "DashManifestStyle": DashManifestStyle.from_dict(obj["DashManifestStyle"]) if obj.get("DashManifestStyle") is not None else None,
            "Destination": obj.get("Destination"),
            "DestinationSettings": CmafGroupSettingsDestinationSettings.from_dict(obj["DestinationSettings"]) if obj.get("DestinationSettings") is not None else None,
            "Encryption": DashIsoGroupSettingsEncryption.from_dict(obj["Encryption"]) if obj.get("Encryption") is not None else None,
            "FragmentLength": obj.get("FragmentLength"),
            "HbbtvCompliance": DashIsoHbbtvCompliance.from_dict(obj["HbbtvCompliance"]) if obj.get("HbbtvCompliance") is not None else None,
            "ImageBasedTrickPlay": DashIsoImageBasedTrickPlay.from_dict(obj["ImageBasedTrickPlay"]) if obj.get("ImageBasedTrickPlay") is not None else None,
            "ImageBasedTrickPlaySettings": DashIsoGroupSettingsImageBasedTrickPlaySettings.from_dict(obj["ImageBasedTrickPlaySettings"]) if obj.get("ImageBasedTrickPlaySettings") is not None else None,
            "MinBufferTime": obj.get("MinBufferTime"),
            "MinFinalSegmentLength": obj.get("MinFinalSegmentLength"),
            "MpdManifestBandwidthType": DashIsoMpdManifestBandwidthType.from_dict(obj["MpdManifestBandwidthType"]) if obj.get("MpdManifestBandwidthType") is not None else None,
            "MpdProfile": DashIsoMpdProfile.from_dict(obj["MpdProfile"]) if obj.get("MpdProfile") is not None else None,
            "PtsOffsetHandlingForBFrames": DashIsoPtsOffsetHandlingForBFrames.from_dict(obj["PtsOffsetHandlingForBFrames"]) if obj.get("PtsOffsetHandlingForBFrames") is not None else None,
            "SegmentControl": DashIsoSegmentControl.from_dict(obj["SegmentControl"]) if obj.get("SegmentControl") is not None else None,
            "SegmentLength": obj.get("SegmentLength"),
            "SegmentLengthControl": DashIsoSegmentLengthControl.from_dict(obj["SegmentLengthControl"]) if obj.get("SegmentLengthControl") is not None else None,
            "VideoCompositionOffsets": DashIsoVideoCompositionOffsets.from_dict(obj["VideoCompositionOffsets"]) if obj.get("VideoCompositionOffsets") is not None else None,
            "WriteSegmentTimelineInRepresentation": DashIsoWriteSegmentTimelineInRepresentation.from_dict(obj["WriteSegmentTimelineInRepresentation"]) if obj.get("WriteSegmentTimelineInRepresentation") is not None else None
        })
        return _obj



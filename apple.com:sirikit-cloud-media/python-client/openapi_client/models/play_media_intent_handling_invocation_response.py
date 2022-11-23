# coding: utf-8

"""
    SiriKit Cloud Media

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.2
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
import pprint
from pydantic import BaseModel, ConfigDict, Field, StrictStr, ValidationError, field_validator
from typing import Any, List, Optional
from openapi_client.models.play_media_intent_handling_handle_invocation_response import PlayMediaIntentHandlingHandleInvocationResponse
from openapi_client.models.play_media_intent_handling_resolve_media_items_invocation_response import PlayMediaIntentHandlingResolveMediaItemsInvocationResponse
from openapi_client.models.play_media_intent_handling_resolve_play_shuffled_invocation_response import PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse
from openapi_client.models.play_media_intent_handling_resolve_playback_queue_location_invocation_response import PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse
from openapi_client.models.play_media_intent_handling_resolve_playback_repeat_mode_invocation_response import PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse
from openapi_client.models.play_media_intent_handling_resolve_resume_playback_invocation_response import PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse
from openapi_client.models.protocol_exception_invocation_response import ProtocolExceptionInvocationResponse
from pydantic import StrictStr, Field
from typing import Union, List, Set, Optional, Dict
from typing_extensions import Literal, Self

PLAYMEDIAINTENTHANDLINGINVOCATIONRESPONSE_ONE_OF_SCHEMAS = ["PlayMediaIntentHandlingHandleInvocationResponse", "PlayMediaIntentHandlingResolveMediaItemsInvocationResponse", "PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse", "PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse", "PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse", "PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse", "ProtocolExceptionInvocationResponse"]

class PlayMediaIntentHandlingInvocationResponse(BaseModel):
    """
    PlayMediaIntentHandlingInvocationResponse
    """
    # data type: PlayMediaIntentHandlingResolveMediaItemsInvocationResponse
    oneof_schema_1_validator: Optional[PlayMediaIntentHandlingResolveMediaItemsInvocationResponse] = None
    # data type: PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse
    oneof_schema_2_validator: Optional[PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse] = None
    # data type: PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse
    oneof_schema_3_validator: Optional[PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse] = None
    # data type: PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse
    oneof_schema_4_validator: Optional[PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse] = None
    # data type: PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse
    oneof_schema_5_validator: Optional[PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse] = None
    # data type: PlayMediaIntentHandlingHandleInvocationResponse
    oneof_schema_6_validator: Optional[PlayMediaIntentHandlingHandleInvocationResponse] = None
    # data type: ProtocolExceptionInvocationResponse
    oneof_schema_7_validator: Optional[ProtocolExceptionInvocationResponse] = None
    actual_instance: Optional[Union[PlayMediaIntentHandlingHandleInvocationResponse, PlayMediaIntentHandlingResolveMediaItemsInvocationResponse, PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse, PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse, PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse, PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse, ProtocolExceptionInvocationResponse]] = None
    one_of_schemas: Set[str] = { "PlayMediaIntentHandlingHandleInvocationResponse", "PlayMediaIntentHandlingResolveMediaItemsInvocationResponse", "PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse", "PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse", "PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse", "PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse", "ProtocolExceptionInvocationResponse" }

    model_config = ConfigDict(
        validate_assignment=True,
        protected_namespaces=(),
    )


    discriminator_value_class_map: Dict[str, str] = {
    }

    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @field_validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = PlayMediaIntentHandlingInvocationResponse.model_construct()
        error_messages = []
        match = 0
        # validate data type: PlayMediaIntentHandlingResolveMediaItemsInvocationResponse
        if not isinstance(v, PlayMediaIntentHandlingResolveMediaItemsInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `PlayMediaIntentHandlingResolveMediaItemsInvocationResponse`")
        else:
            match += 1
        # validate data type: PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse
        if not isinstance(v, PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse`")
        else:
            match += 1
        # validate data type: PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse
        if not isinstance(v, PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse`")
        else:
            match += 1
        # validate data type: PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse
        if not isinstance(v, PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse`")
        else:
            match += 1
        # validate data type: PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse
        if not isinstance(v, PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse`")
        else:
            match += 1
        # validate data type: PlayMediaIntentHandlingHandleInvocationResponse
        if not isinstance(v, PlayMediaIntentHandlingHandleInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `PlayMediaIntentHandlingHandleInvocationResponse`")
        else:
            match += 1
        # validate data type: ProtocolExceptionInvocationResponse
        if not isinstance(v, ProtocolExceptionInvocationResponse):
            error_messages.append(f"Error! Input type `{type(v)}` is not `ProtocolExceptionInvocationResponse`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in PlayMediaIntentHandlingInvocationResponse with oneOf schemas: PlayMediaIntentHandlingHandleInvocationResponse, PlayMediaIntentHandlingResolveMediaItemsInvocationResponse, PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse, PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse, PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse, PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse, ProtocolExceptionInvocationResponse. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in PlayMediaIntentHandlingInvocationResponse with oneOf schemas: PlayMediaIntentHandlingHandleInvocationResponse, PlayMediaIntentHandlingResolveMediaItemsInvocationResponse, PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse, PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse, PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse, PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse, ProtocolExceptionInvocationResponse. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: Union[str, Dict[str, Any]]) -> Self:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Returns the object represented by the json string"""
        instance = cls.model_construct()
        error_messages = []
        match = 0

        # deserialize data into PlayMediaIntentHandlingResolveMediaItemsInvocationResponse
        try:
            instance.actual_instance = PlayMediaIntentHandlingResolveMediaItemsInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse
        try:
            instance.actual_instance = PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse
        try:
            instance.actual_instance = PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse
        try:
            instance.actual_instance = PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse
        try:
            instance.actual_instance = PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into PlayMediaIntentHandlingHandleInvocationResponse
        try:
            instance.actual_instance = PlayMediaIntentHandlingHandleInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into ProtocolExceptionInvocationResponse
        try:
            instance.actual_instance = ProtocolExceptionInvocationResponse.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into PlayMediaIntentHandlingInvocationResponse with oneOf schemas: PlayMediaIntentHandlingHandleInvocationResponse, PlayMediaIntentHandlingResolveMediaItemsInvocationResponse, PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse, PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse, PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse, PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse, ProtocolExceptionInvocationResponse. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into PlayMediaIntentHandlingInvocationResponse with oneOf schemas: PlayMediaIntentHandlingHandleInvocationResponse, PlayMediaIntentHandlingResolveMediaItemsInvocationResponse, PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse, PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse, PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse, PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse, ProtocolExceptionInvocationResponse. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        if hasattr(self.actual_instance, "to_json") and callable(self.actual_instance.to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> Optional[Union[Dict[str, Any], PlayMediaIntentHandlingHandleInvocationResponse, PlayMediaIntentHandlingResolveMediaItemsInvocationResponse, PlayMediaIntentHandlingResolvePlayShuffledInvocationResponse, PlayMediaIntentHandlingResolvePlaybackQueueLocationInvocationResponse, PlayMediaIntentHandlingResolvePlaybackRepeatModeInvocationResponse, PlayMediaIntentHandlingResolveResumePlaybackInvocationResponse, ProtocolExceptionInvocationResponse]]:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        if hasattr(self.actual_instance, "to_dict") and callable(self.actual_instance.to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.model_dump())



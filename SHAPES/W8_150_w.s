SIMISA@@@@@@@@@@JINX0s1t______

shape (
	shape_header ( 00000000 00000000 )
	volumes ( 1
		vol_sphere (
			vector ( 0 1.68634 -0.0130768 ) 1.43909
		)
	)
	shader_names ( 1
		named_shader ( TexDiff )
	)
	texture_filter_names ( 1
		named_filter_mode ( MipLinear )
	)
	points ( 6
		point ( 8.41069e-008 1.40074 -0.0130768 )
		point ( 0.329791 1.97195 -0.0130768 )
		point ( -0.329791 1.97195 -0.0130768 )
		point ( 8.41069e-008 1.40074 -0.0130767 )
		point ( -0.329791 1.97195 -0.0130768 )
		point ( 0.329791 1.97195 -0.0130768 )
	)
	uv_points ( 6
		uv_point ( 0.00390625 0.769531 )
		uv_point ( 0.835938 0.769531 )
		uv_point ( 0.402344 0.00390625 )
		uv_point ( 0.943359 0.480469 )
		uv_point ( 0.519531 0.480469 )
		uv_point ( 0.730469 0.849609 )
	)
	normals ( 2
		vector ( 1.12959e-008 -6.03258e-008 1 )
		vector ( 2.96518e-008 -1.03532e-007 -1 )
	)
	sort_vectors ( 0
	)
	colours ( 0 )
	matrices ( 1
		matrix Polygon.1 ( 1 0 0 0 1 0 0 0 1 0 0 0 )
	)
	images ( 2
		image ( W_tyl.ace )
		image ( W8_120_130_140_150_st.ace )
	)
	textures ( 2
		texture ( 0 0 -3 ff000000 )
		texture ( 1 0 -3 ff000000 )
	)
	light_materials ( 0 )
	light_model_cfgs ( 1
		light_model_cfg ( 00000000
			uv_ops ( 1
				uv_op_copy ( 1 0 )
			)
		)
	)
	vtx_states ( 1
		vtx_state ( 00000000 0 -5 0 00000002 )
	)
	prim_states ( 2
		prim_state Polygon.1_SolidNorm ( 00000000 0
			tex_idxs ( 1 0 ) 0 0 0 0 1
		)
		prim_state Polygon.1_SolidNorm ( 00000000 0
			tex_idxs ( 1 1 ) 0 0 0 0 1
		)
	)
	lod_controls ( 1
		lod_control (
			distance_levels_header ( 0 )
			distance_levels ( 1
				distance_level (
					distance_level_header (
						dlevel_selection ( 1000 )
						hierarchy ( 1 -1 )
					)
					sub_objects ( 1
						sub_object (
							sub_object_header ( 00000400 -1 -1 000001d2 000001c4
								geometry_info ( 2 1 0 6 0 0 2 0 0 0
									geometry_nodes ( 1
										geometry_node ( 1 0 0 0 0
											cullable_prims ( 2 2 6 )
										)
									)
									geometry_node_map ( 1 0 )
								)
								subobject_shaders ( 1 0 )
								subobject_light_cfgs ( 1 0 ) 0
							)
							vertices ( 6
								vertex ( 00000000 0 0 ffffffff ff000000
									vertex_uvs ( 1 2 )
								)
								vertex ( 00000000 1 0 ffffffff ff000000
									vertex_uvs ( 1 1 )
								)
								vertex ( 00000000 2 0 ffffffff ff000000
									vertex_uvs ( 1 0 )
								)
								vertex ( 00000000 3 1 ffffffff ff000000
									vertex_uvs ( 1 5 )
								)
								vertex ( 00000000 4 1 ffffffff ff000000
									vertex_uvs ( 1 4 )
								)
								vertex ( 00000000 5 1 ffffffff ff000000
									vertex_uvs ( 1 3 )
								)
							)
							vertex_sets ( 1
								vertex_set ( 0 0 6 )
							)
							primitives ( 4
								prim_state_idx ( 0 )
								indexed_trilist (
									vertex_idxs ( 3 0 1 2 )
									normal_idxs ( 1 0 3 )
									flags ( 1 00000000 )
								)
								prim_state_idx ( 1 )
								indexed_trilist (
									vertex_idxs ( 3 3 4 5 )
									normal_idxs ( 1 1 3 )
									flags ( 1 00000000 )
								)
							)
						)
					)
				)
			)
		)
	)
)
